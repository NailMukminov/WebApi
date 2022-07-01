package vkapiutils;

public enum ApiConfig {
        VK_API("https://api.vk.com/");

        private final String url;

        ApiConfig(String url){
            this.url = url;
        }

        public String getCode(){ return url;}

}
