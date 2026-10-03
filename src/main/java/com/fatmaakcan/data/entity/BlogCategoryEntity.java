package com.fatmaakcan.data.entity;

import com.fatmaakcan.audit.AuditingAwareBaseDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.io.Serial;
import java.io.Serializable;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2

// Table
@Entity
@Table(name ="blog_categories")

// BlogCategoryDto(1) - BlogDto(N)
public class BlogCategoryEntity extends AuditingAwareBaseDto {

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="blog_category_id ")
    private Long blogCategoryId;

    // categoryName
    @Column(unique = true,nullable = false,length = 250)
    private String categoryName;

    /// //////////////////////////////
    // Relation
} // end BlogCategoryEntity
