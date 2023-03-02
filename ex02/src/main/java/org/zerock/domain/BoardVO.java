package org.zerock.domain;

import java.util.Date;

import lombok.Data;

// 변수명과 디비 속성명 일치 
@Data
public class BoardVO {

  private Long bno;
  private String title;
  private String content;
  private String writer;
  private Date regdate;
  private Date updateDate;
}
