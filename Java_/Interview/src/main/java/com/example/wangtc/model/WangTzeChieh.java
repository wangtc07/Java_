package com.example.wangtc.model;

import java.util.Date;
import java.util.List;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;

public class WangTzeChieh {

  private String name;

  private Date birthday;

  private String address;

  private List<School> schoolList;

  private List<Skill> skillList;

  private List<Job> jobList;

  public WangTzeChieh() {
  }

  public WangTzeChieh(String name, Date birthday, String address,
      List<School> schoolList, List<Skill> skillList,
      List<Job> jobList) {
    this.name = name;
    this.birthday = birthday;
    this.address = address;
    this.schoolList = schoolList;
    this.skillList = skillList;
    this.jobList = jobList;
  }

  public String getName() {
    return name;
  }

  public Date getBirthday() {
    return birthday;
  }

  public String getAddress() {
    return address;
  }

  public List<School> getSchoolList() {
    return schoolList;
  }

  public List<Skill> getSkillList() {
    return skillList;
  }

  public List<Job> getJobList() {
    return jobList;
  }

  public static class Builder {

    private String name;
    private Date birthday;
    private String address;
    private List<School> schoolList;
    private List<Skill> skillList;
    private List<Job> jobList;

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setBirthday(Date birthday) {
      this.birthday = birthday;
      return this;
    }

    public Builder setAddress(String address) {
      this.address = address;
      return this;
    }

    public Builder setSchoolList(List<School> schoolList) {
      this.schoolList = schoolList;
      return this;
    }

    public Builder setSkillList(List<Skill> skillList) {
      this.skillList = skillList;
      return this;
    }

    public Builder setJobList(List<Job> jobList) {
      this.jobList = jobList;
      return this;
    }

    public WangTzeChieh createWangTzeChieh() {
      return new WangTzeChieh(name, birthday, address, schoolList, skillList, jobList);
    }
  }
}
