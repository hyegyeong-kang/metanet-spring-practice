package kosa.model;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

// JSR 303
public class Board implements Serializable {
	private int seq;
	
	@NotEmpty(message = "반드시 입력하세요")
	@Size(min = 2, max = 5, message = "2~5자 입력")
	private String title;
	
	@Pattern(regexp = "[0-9a-zA-Z가-힣]*", message = "특수문자 금지")
	private String writer;
	
	private String contents;
	private String regdate;
	private int hintCount;
	
	public Board() {}

	public Board(int seq, String title, String writer, String contents, String regdate, int hintCount) {
		super();
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.regdate = regdate;
		this.hintCount = hintCount;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getHintCount() {
		return hintCount;
	}

	public void setHintCount(int hintCount) {
		this.hintCount = hintCount;
	}

	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", writer=" + writer + ", contents=" + contents + ", regdate="
				+ regdate + ", hintCount=" + hintCount + "]";
	}
	
	

}
