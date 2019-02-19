package com.itheima.domain;

public class haha {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "haha{" +
                "sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        haha haha = (haha) o;

        return sex != null ? sex.equals(haha.sex) : haha.sex == null;
    }

    @Override
    public int hashCode() {
        return sex != null ? sex.hashCode() : 0;
    }

}
