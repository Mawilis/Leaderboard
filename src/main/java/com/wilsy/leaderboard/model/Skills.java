package com.wilsy.leaderboard.model;

//
// Created by Wilson Khanyezi on 2020/09/09.
//
class Skills {
    private String name;
    private Integer score;
    private String country;
    private String badgeUrl;

    public Skills() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBadgeUrl() {
        return badgeUrl;
    }

    public void setBadgeUrl(String badgeUrl) {
        this.badgeUrl = badgeUrl;
    }

    public Skills(String name, Integer score, String country, String badgeUrl) {
        this.name = name;
        this.score = score;
        this.country = country;
        this.badgeUrl = badgeUrl;

    }

    @Override
    public String toString() {
        return "Skills{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", country='" + country + '\'' +
                ", badgeUrl='" + badgeUrl + '\'' +
                '}';
    }
}
