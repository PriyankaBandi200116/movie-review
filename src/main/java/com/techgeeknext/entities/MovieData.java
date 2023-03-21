package com.techgeeknext.entities;
import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
@Table(name = "movie_data")

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class MovieData implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="admin")
    private String admin;
	
	@Column(name="artists")
    private String artists;
	
	@Column(name="summary")
    private String summary;
	
	@Column(name="director")
    private String director;
	
	@Column(name="genere")
    private String genere;
	
	@Column(name="lang")
    private String lang;
	
	@Column(name="moviename")
    private String moviename;
	
	@Column(name="producer")
	private String producer;
	
	@Column (name="releasedate")
	private String releasedate;
	
	@Column(name = "image", unique = false, nullable = false, length = 100000)
	private byte[] image;
	
	@Column(name = "createdat" ,nullable=false,updatable=false )
	private String createdat;
	
	@Column(name = "updatedat",nullable = false)
	private String updatedat;
	
	@Column(name = "filename")
	private String filename;

	@Column(name = "filetype")
	private String filetype;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getArtists() {
		return artists;
	}

	public void setArtists(String artists) {
		this.artists = artists;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getCreatedat() {
		return createdat;
	}

	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}

	public String getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(String updatedat) {
		this.updatedat = updatedat;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "MovieData [id=" + id + ", admin=" + admin + ", artists=" + artists + ", summary=" + summary
				+ ", director=" + director + ", genere=" + genere + ", lang=" + lang + ", moviename=" + moviename
				+ ", producer=" + producer + ", releasedate=" + releasedate + ", image=" + Arrays.toString(image)
				+ ", createdat=" + createdat + ", updatedat=" + updatedat + ", filename=" + filename + ", filetype="
				+ filetype + "]";
	}

	public MovieData(long id, String admin, String artists, String summary, String director, String genere, String lang,
			String moviename, String producer, String releasedate, byte[] image, String createdat, String updatedat,
			String filename, String filetype) {
		super();
		this.id = id;
		this.admin = admin;
		this.artists = artists;
		this.summary = summary;
		this.director = director;
		this.genere = genere;
		this.lang = lang;
		this.moviename = moviename;
		this.producer = producer;
		this.releasedate = releasedate;
		this.image = image;
		this.createdat = createdat;
		this.updatedat = updatedat;
		this.filename = filename;
		this.filetype = filetype;
	}

	public MovieData() {
		super();
		// TODO Auto-generated constructor stub
	}

		
	
	}
	

