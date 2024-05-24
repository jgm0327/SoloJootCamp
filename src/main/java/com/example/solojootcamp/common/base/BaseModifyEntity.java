package com.example.solojootcamp.common.base;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

@Getter
@MappedSuperclass
public abstract class BaseModifyEntity extends BaseEntity{
    @LastModifiedBy
    private String modifiedBy;

    @LastModifiedDate
    private LocalDate modifiedAt;

    @LastModifiedDate
    private LocalDate deletedAt;

    @LastModifiedBy
    private String deletedBy;
}
