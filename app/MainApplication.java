package com.sss.lottery;

import java.util.List;

/**
 * Created by suncm on 2018/1/15.
 */

public class MainApplication {

    private List<HoursumBean> hoursum;

    public List<HoursumBean> getHoursum() {
        return hoursum;
    }

    public void setHoursum(List<HoursumBean> hoursum) {
        this.hoursum = hoursum;
    }

    public static class HoursumBean {
        /**
         * SO2 : 14
         * NO2 : 54
         * CO : 1
         * O3 : 17
         * PM10 : 128
         * PM25 : 92
         */

        private int SO2;
        private int NO2;
        private int CO;
        private int O3;
        private int PM10;
        private int PM25;

        public int getSO2() {
            return SO2;
        }

        public void setSO2(int SO2) {
            this.SO2 = SO2;
        }

        public int getNO2() {
            return NO2;
        }

        public void setNO2(int NO2) {
            this.NO2 = NO2;
        }

        public int getCO() {
            return CO;
        }

        public void setCO(int CO) {
            this.CO = CO;
        }

        public int getO3() {
            return O3;
        }

        public void setO3(int O3) {
            this.O3 = O3;
        }

        public int getPM10() {
            return PM10;
        }

        public void setPM10(int PM10) {
            this.PM10 = PM10;
        }

        public int getPM25() {
            return PM25;
        }

        public void setPM25(int PM25) {
            this.PM25 = PM25;
        }
    }
}
