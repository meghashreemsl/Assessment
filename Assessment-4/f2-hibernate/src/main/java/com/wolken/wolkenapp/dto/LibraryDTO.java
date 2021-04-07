package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NamedQuery(name="update", query="update LibraryDTO lib set lib.price=:pr where lib.bookName=:bn")
@NamedQuery(name="selectAll", query="from LibraryDTO lib")
		

@Entity
@Table(name="library_table")
@Getter
@Setter
@ToString

public class LibraryDTO {
	
		@Id
		@Column(name="book_id")
		private Integer bookId;
		@Column(name="book_name")
		private String bookName;
		@Column(name="book_price")
		private Integer price;
		@Column(name="book_author")
		private String author;


}
