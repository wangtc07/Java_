package com.example.wangtc;

import com.example.wangtc.model.WangTzeChieh;

public class WangTc {

  public static void main(String[] args) {
    // 出生
    WangTzeChieh wangTzeChieh =
        new WangTzeChieh.Builder()
            .setName(null)
            .setBirthday(null)
            .setAddress(null)
            .setSchoolList(null)
            .setSkillList(null)
            .setJobList(null)
            .createWangTzeChieh();

    System.out.printf(wangTzeChieh.toString());

    // 學歷

    // 經歷

    //
  }
}
