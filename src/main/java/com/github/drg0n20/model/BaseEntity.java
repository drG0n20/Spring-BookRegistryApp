package com.github.drg0n20.model;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
public class BaseEntity {

    private String uuid = UUID.randomUUID().toString();
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

    @PrePersist
    public void prePersist() {
        if (createAt == null) {
            createAt = new Date();
        } else {
            lastUpdate = new Date();
        }
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseEntity that = (BaseEntity) o;

        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }
}
