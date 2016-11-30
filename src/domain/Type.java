package domain;

public enum Type {
        ADS("реклама"), NEWS("новости"), PORTAL("портал"), MIRROR("зеркало");

        private String type;

        public String getType() {
            return type;
        }

        private Type(String type) {
            this.type = type;
        }
    }