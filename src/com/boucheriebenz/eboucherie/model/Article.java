package com.boucheriebenz.eboucherie.model;

import java.util.Date;

public class Article {

    private Integer id;
    private String libelle;
    private String type;
    private String race;
    private String description ;
    private Date debut ;
    private Date fin ; 
    private boolean enLigne;
    private ArticlePhoto articlePhoto ; 
    
    public ArticlePhoto getArticlePhoto() {
		return articlePhoto;
	}

	public void setArticlePhoto(ArticlePhoto articlePhoto) {
		this.articlePhoto = articlePhoto;
	}

	public Article() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

   
	public String getDescription() {
		return description;
	}

	public Date getDebut() {
		return debut;
	}

	public Date getFin() {
		return fin;
	}

	public boolean getEnLigne() {
		return enLigne;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public void setEnLigne(boolean enLigne) {
		this.enLigne = enLigne;
	}

	@Override
    public int hashCode() {
        return this.getLibelle().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Article ar = new Article();
        if (obj instanceof Article) {
            ar = (Article) obj;
        }

        return (ar.getLibelle().equals(this.getLibelle()));
    }
    
}
