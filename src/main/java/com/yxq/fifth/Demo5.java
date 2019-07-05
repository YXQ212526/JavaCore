package com.yxq.fifth;


import java.util.Objects;

public abstract class Demo5 {
        private String name;

        public abstract String getDes();

        public Demo5(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
        public boolean equals(Object other)
        {
            if(this==other)return true;
            if(other==null)return false;
            if(other.getClass()!=this.getClass())return false;
            Demo5 change=(Demo5)other;
            return this.name==change.name;

        }
        public  int hashCode()
        {
            return Objects.hash(name);
        }
        public String toString(){
            return getClass().getName()+"name="+name+"";
        }
    }

