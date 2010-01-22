package com.totsp.bookworm.model;

import java.util.Date;
import java.util.Set;

public final class Book {  
   
   private long id;
   private String isbn;
   private String title;   
   private Set<Author> authors;
   private Date datePub;
   
   public Book() {
   }
   
   public Book(String isbn, String title, Set<Author> authors, Date datePub) {
      this.id = 0L;
      this.isbn = isbn;
      this.title = title;
      this.authors = authors;
      this.datePub = datePub;
   }
   
   public String toString() {
      StringBuilder sb = new StringBuilder() ;
      sb.append("Book - ");
      sb.append("id:" + this.getId() + " ");
      sb.append("title:" + this.getTitle() + " ");
      sb.append("isbn:" + this.getIsbn() + " ");
      sb.append("authors:" + this.getAuthors() + " ");
      sb.append("datepub:" + this.getDatePub() + " ");   
      return sb.toString();
   }

   public long getId() {
      return this.id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getIsbn() {
      return this.isbn;
   }

   public void setIsbn(String isbn) {
      this.isbn = isbn;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public Set<Author> getAuthors() {
      return this.authors;
   }

   public void setAuthors(Set<Author> authors) {
      this.authors = authors;
   }

   public Date getDatePub() {      
      return this.datePub;
   }

   public void setDatePub(Date datePub) {
      this.datePub = datePub;
   }  
   
   
}