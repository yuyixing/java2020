package com.yuyx.shardingspheredemo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * course
 *
 * @author yuyx
 */
@Data
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long cid;
    private String cname;
    private Long userId;
    private String cstatus;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Course other = (Course) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
                && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getCstatus() == null ? other.getCstatus() == null : this.getCstatus().equals(other.getCstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCstatus() == null) ? 0 : getCstatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", cname=").append(cname);
        sb.append(", userId=").append(userId);
        sb.append(", cstatus=").append(cstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}