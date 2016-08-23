package io.pivotal.cso.test;


public class Greeting {

    private final long id;
    private final String content;
    private final String fqdn;

    public Greeting(long id, String content, String fqdn) {
        this.id = id;
        this.content = content;
        this.fqdn = fqdn;
    }
    
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    public String getFqdn() {
    	return fqdn;
    }
}
