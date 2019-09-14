package org.springframework.jdbc.support.lob;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.lang.Nullable;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.*;

/**
 * 数据库大字段处理
 */
public class PtDefaultLobHandler extends AbstractLobHandler {
    protected final Log logger = LogFactory.getLog(this.getClass());
    private boolean wrapAsLob = false;
    private boolean streamAsLob = false;
    private boolean createTemporaryLob = false;

    public PtDefaultLobHandler() {
    }

    public void setWrapAsLob(boolean wrapAsLob) {
        this.wrapAsLob = wrapAsLob;
    }

    public void setStreamAsLob(boolean streamAsLob) {
        this.streamAsLob = streamAsLob;
    }

    public void setCreateTemporaryLob(boolean createTemporaryLob) {
        this.createTemporaryLob = createTemporaryLob;
    }

    @Nullable
    public byte[] getBlobAsBytes(ResultSet rs, int columnIndex) throws SQLException {
        this.logger.debug("Returning BLOB as bytes");
        if (this.wrapAsLob) {
            Blob blob = rs.getBlob(columnIndex);
            return blob.getBytes(1L, (int) blob.length());
        } else {
            return rs.getBytes(columnIndex);
        }
    }

    @Nullable
    public String getBlobAsString(ResultSet rs, int columnIndex) throws SQLException {
        this.logger.debug("Returning BLOB as bytes");
        if (this.wrapAsLob) {
            Blob blob = rs.getBlob(columnIndex);
            return new String(blob.getBytes(1L, (int) blob.length()));
        } else {
            if (rs.getBytes(columnIndex) != null) return new String(rs.getBytes(columnIndex));
            else return "";
        }
    }

    @Nullable
    public InputStream getBlobAsBinaryStream(ResultSet rs, int columnIndex) throws SQLException {
        this.logger.debug("Returning BLOB as binary stream");
        if (this.wrapAsLob) {
            Blob blob = rs.getBlob(columnIndex);
            return blob.getBinaryStream();
        } else {
            return rs.getBinaryStream(columnIndex);
        }
    }

    @Nullable
    public String getBlobAsString(ResultSet rs, String columnName) throws SQLException {
        return this.getBlobAsString(rs, rs.findColumn(columnName));
    }


    @Nullable
    public String getClobAsString(ResultSet rs, int columnIndex) throws SQLException {
        this.logger.debug("Returning CLOB as string");
        if (this.wrapAsLob) {
            Clob clob = rs.getClob(columnIndex);
            return clob.getSubString(1L, (int) clob.length());
        } else {
            return rs.getString(columnIndex);
        }
    }

    public InputStream getClobAsAsciiStream(ResultSet rs, int columnIndex) throws SQLException {
        this.logger.debug("Returning CLOB as ASCII stream");
        if (this.wrapAsLob) {
            Clob clob = rs.getClob(columnIndex);
            return clob.getAsciiStream();
        } else {
            return rs.getAsciiStream(columnIndex);
        }
    }

    public Reader getClobAsCharacterStream(ResultSet rs, int columnIndex) throws SQLException {
        this.logger.debug("Returning CLOB as character stream");
        if (this.wrapAsLob) {
            Clob clob = rs.getClob(columnIndex);
            return clob.getCharacterStream();
        } else {
            return rs.getCharacterStream(columnIndex);
        }
    }

    public LobCreator getLobCreator() {
        return (LobCreator) (this.createTemporaryLob ? new TemporaryLobCreator() : new PtDefaultLobHandler.DefaultLobCreator());
    }

    protected class DefaultLobCreator implements LobCreator {
        protected DefaultLobCreator() {
        }

        public void setBlobAsBytes(PreparedStatement ps, int paramIndex, @Nullable byte[] content) throws SQLException {
            if (PtDefaultLobHandler.this.streamAsLob) {
                if (content != null) {
                    ps.setBlob(paramIndex, new ByteArrayInputStream(content), (long) content.length);
                } else {
                    ps.setBlob(paramIndex, (Blob) null);
                }
            } else if (PtDefaultLobHandler.this.wrapAsLob) {
                if (content != null) {
                    ps.setBlob(paramIndex, new PassThroughBlob(content));
                } else {
                    ps.setBlob(paramIndex, (Blob) null);
                }
            } else {
                ps.setBytes(paramIndex, content);
            }

            if (PtDefaultLobHandler.this.logger.isDebugEnabled()) {
                PtDefaultLobHandler.this.logger.debug(content != null ? "Set bytes for BLOB with length " + content.length : "Set BLOB to null");
            }

        }

        public void setBlobAsString(PreparedStatement ps, int paramIndex, @Nullable byte[] content) throws SQLException {
            if (PtDefaultLobHandler.this.streamAsLob) {
                if (content != null) {
                    ps.setBlob(paramIndex, new ByteArrayInputStream(content), (long) content.length);
                } else {
                    ps.setBlob(paramIndex, (Blob) null);
                }
            } else if (PtDefaultLobHandler.this.wrapAsLob) {
                if (content != null) {
                    ps.setBlob(paramIndex, new PassThroughBlob(content));
                } else {
                    ps.setBlob(paramIndex, (Blob) null);
                }
            } else {
                ps.setBytes(paramIndex, content);
            }

            if (PtDefaultLobHandler.this.logger.isDebugEnabled()) {
                PtDefaultLobHandler.this.logger.debug(content != null ? "Set bytes for BLOB with length " + content.length : "Set BLOB to null");
            }

        }

        public void setBlobAsBinaryStream(PreparedStatement ps, int paramIndex, @Nullable InputStream binaryStream, int contentLength) throws SQLException {
            if (PtDefaultLobHandler.this.streamAsLob) {
                if (binaryStream != null) {
                    if (contentLength >= 0) {
                        ps.setBlob(paramIndex, binaryStream, (long) contentLength);
                    } else {
                        ps.setBlob(paramIndex, binaryStream);
                    }
                } else {
                    ps.setBlob(paramIndex, (Blob) null);
                }
            } else if (PtDefaultLobHandler.this.wrapAsLob) {
                if (binaryStream != null) {
                    ps.setBlob(paramIndex, new PassThroughBlob(binaryStream, (long) contentLength));
                } else {
                    ps.setBlob(paramIndex, (Blob) null);
                }
            } else if (contentLength >= 0) {
                ps.setBinaryStream(paramIndex, binaryStream, contentLength);
            } else {
                ps.setBinaryStream(paramIndex, binaryStream);
            }

            if (PtDefaultLobHandler.this.logger.isDebugEnabled()) {
                PtDefaultLobHandler.this.logger.debug(binaryStream != null ? "Set binary stream for BLOB with length " + contentLength : "Set BLOB to null");
            }

        }

        public void setClobAsString(PreparedStatement ps, int paramIndex, @Nullable String content) throws SQLException {
            if (PtDefaultLobHandler.this.streamAsLob) {
                if (content != null) {
                    ps.setClob(paramIndex, new StringReader(content), (long) content.length());
                } else {
                    ps.setClob(paramIndex, (Clob) null);
                }
            } else if (PtDefaultLobHandler.this.wrapAsLob) {
                if (content != null) {
                    ps.setClob(paramIndex, new PassThroughClob(content));
                } else {
                    ps.setClob(paramIndex, (Clob) null);
                }
            } else {
                ps.setString(paramIndex, content);
            }

            if (PtDefaultLobHandler.this.logger.isDebugEnabled()) {
                PtDefaultLobHandler.this.logger.debug(content != null ? "Set string for CLOB with length " + content.length() : "Set CLOB to null");
            }

        }

        public void setClobAsAsciiStream(PreparedStatement ps, int paramIndex, @Nullable InputStream asciiStream, int contentLength) throws SQLException {
            if (PtDefaultLobHandler.this.streamAsLob) {
                if (asciiStream != null) {
                    Reader reader = new InputStreamReader(asciiStream, StandardCharsets.US_ASCII);
                    if (contentLength >= 0) {
                        ps.setClob(paramIndex, reader, (long) contentLength);
                    } else {
                        ps.setClob(paramIndex, reader);
                    }
                } else {
                    ps.setClob(paramIndex, (Clob) null);
                }
            } else if (PtDefaultLobHandler.this.wrapAsLob) {
                if (asciiStream != null) {
                    ps.setClob(paramIndex, new PassThroughClob(asciiStream, (long) contentLength));
                } else {
                    ps.setClob(paramIndex, (Clob) null);
                }
            } else if (contentLength >= 0) {
                ps.setAsciiStream(paramIndex, asciiStream, contentLength);
            } else {
                ps.setAsciiStream(paramIndex, asciiStream);
            }

            if (PtDefaultLobHandler.this.logger.isDebugEnabled()) {
                PtDefaultLobHandler.this.logger.debug(asciiStream != null ? "Set ASCII stream for CLOB with length " + contentLength : "Set CLOB to null");
            }

        }

        public void setClobAsCharacterStream(PreparedStatement ps, int paramIndex, @Nullable Reader characterStream, int contentLength) throws SQLException {
            if (PtDefaultLobHandler.this.streamAsLob) {
                if (characterStream != null) {
                    if (contentLength >= 0) {
                        ps.setClob(paramIndex, characterStream, (long) contentLength);
                    } else {
                        ps.setClob(paramIndex, characterStream);
                    }
                } else {
                    ps.setClob(paramIndex, (Clob) null);
                }
            } else if (PtDefaultLobHandler.this.wrapAsLob) {
                if (characterStream != null) {
                    ps.setClob(paramIndex, new PassThroughClob(characterStream, (long) contentLength));
                } else {
                    ps.setClob(paramIndex, (Clob) null);
                }
            } else if (contentLength >= 0) {
                ps.setCharacterStream(paramIndex, characterStream, contentLength);
            } else {
                ps.setCharacterStream(paramIndex, characterStream);
            }

            if (PtDefaultLobHandler.this.logger.isDebugEnabled()) {
                PtDefaultLobHandler.this.logger.debug(characterStream != null ? "Set character stream for CLOB with length " + contentLength : "Set CLOB to null");
            }

        }

        public void close() {
        }
    }

}
