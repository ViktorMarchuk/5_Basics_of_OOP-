package by.epam.task03.entity;

public class Calendar{
    private String year;
    Month month;

    public Calendar(String year){
        this.year = year;

    }

    public String getYear(){
        return year;
    }

    public void setYear(String year){
        this.year = year;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Calendar)) return false;

        Calendar calendar = (Calendar)o;

        return getYear().equals(calendar.getYear());
    }

    @Override
    public int hashCode(){
        return getYear().hashCode();
    }

    @Override
    public String toString(){
        return "Calendar{" +
                "year='" + year + '\'' +
                '}';
    }

    public static class Month{
        private String day;
        private String event;

        public Month(String day, String event){
            this.day = day;
            this.event = event;
        }

        public String getDay(){
            return day;
        }

        public void setDay(String day){
            this.day = day;
        }

        public String getEvent(){
            return event;
        }

        public void setEvent(String event){
            this.event = event;
        }

        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if(!(o instanceof Month)) return false;

            Month month = (Month)o;

            if(getDay() != null ? !getDay().equals(month.getDay()) : month.getDay() != null) return false;
            return getEvent() != null ? getEvent().equals(month.getEvent()) : month.getEvent() == null;
        }

        @Override
        public int hashCode(){
            int result = getDay() != null ? getDay().hashCode() : 0;
            result = 31 * result + (getEvent() != null ? getEvent().hashCode() : 0);
            return result;
        }

        @Override
        public String toString(){
            return "Month{" +
                    "day='" + day + '\'' +
                    ", event='" + event + '\'' +
                    '}';
        }
    }
}


