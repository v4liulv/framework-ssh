package com.sinobest.framework.base.domain;

/**
 * @author liulv
 * @date 2019/1/11
 * @time 23:49
 *
 * @description 专门针对DataTable插件使用的请求参数的实体类
 */
public abstract class DataTablesEntity {

    private Integer draw;
    private Integer startIndex;
    private Integer pageSize;
    private String orderColumn;//获取客户端需要那一列排序, 如果为空需要定义字段
    private String orderDir;  //获取排序方式，如果为空 需要定义为asc 或 desc
    private String fuzzySearch; //是否模糊查询
    private String fuzzy;//模糊查询值
    private Integer isDateField = 1;

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
    }

    public String getOrderDir() {
        return orderDir;
    }

    public void setOrderDir(String orderDir) {
        this.orderDir = orderDir;
    }

    public String getFuzzySearch() {
        return fuzzySearch;
    }

    public void setFuzzySearch(String fuzzySearch) {
        this.fuzzySearch = fuzzySearch;
    }

    public String getFuzzy() {
        return fuzzy;
    }

    public void setFuzzy(String fuzzy) {
        this.fuzzy = fuzzy;
    }

    public Integer getIsDateField() {
        return isDateField;
    }

    public void setIsDateField(Integer isDateField) {
        this.isDateField = isDateField;
    }
}
