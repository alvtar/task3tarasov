package domain;

public enum Type {
        ADS("реклама"), NEWS("новости"), PORTAL("портал"), MIRROR("зеркало");

        private String type;

        public String getType() {
            return type;
        }
        
        public void setType(String type) {
            this.type=type;
        }

        private Type(String type) {
            this.type = type;
        }
    }