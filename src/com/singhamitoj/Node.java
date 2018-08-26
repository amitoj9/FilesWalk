package com.singhamitoj;

import java.io.File;
import java.util.ArrayList;

public class Node {

	private File path;
    private Boolean isDirectory;
    private ArrayList<Node> childNodes;
    
    public Node(File path,  Boolean isDirectory) {
        this.path = path;
        this.isDirectory = isDirectory;
        this.childNodes= new ArrayList<Node>();
    }
   
    public File getPath() {
		return path;
	}
	public Boolean isDirectory() {
		return isDirectory;
	}
	
	public ArrayList<Node> getChildNodes(){
		return childNodes;
	}
    
	public void add(Node n) {
		this.childNodes.add(n);
	}
}
