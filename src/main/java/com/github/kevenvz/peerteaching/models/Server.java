package com.github.kevenvz.peerteaching.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Server {
    private Long id;
    private String processor;
    private String memory;

    @JsonProperty("storage-space")
    private String storageSpace;

    public Server() {
    }

    public Server(Long id, String processor, String memory, String storageSpace) {
        this.id = id;
        this.processor = processor;
        this.memory = memory;
        this.storageSpace = storageSpace;
    }

    public Server(String processor, String memory, String storageSpace) {
        this.processor = processor;
        this.memory = memory;
        this.storageSpace = storageSpace;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(String storageSpace) {
        this.storageSpace = storageSpace;
    }
}
