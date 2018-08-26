package com.singhamitoj;

import java.io.File;
import java.util.ArrayList;

public class FileWalk {

	public static void main(String args[]) {
		
		System.out.println("Enter path for start directory");
		
		String dd="D:\\";
		
		File file= new File(dd);
			Node root=new Node(file,file.isDirectory());
			printAll(root);	
		
		
	}
	public static void addChildern(Node root) {
		Node temp;
		for(String path:root.getPath().list()) {
			System.out.println(root.getPath().getAbsolutePath()+ "\\"+path);
			File ss=new File(root.getPath().getAbsolutePath()+"\\"+ path);
			temp= new Node(ss,ss.isDirectory());
			root.add(temp);
		}
	}

	public static void printAll(Node head) {
		if(head== null)
			return;
		addChildern(head);
		ArrayList<Node> childrenNodes=head.getChildNodes();
		
		for(Node node:childrenNodes) {
			File file=node.getPath();
			Node temp;
			if(file.isDirectory())
			for(String path:file.list()) {
				System.out.println(file.getAbsolutePath()+ "\\"+path);
				File ss=new File(file.getAbsolutePath()+"\\"+ path);
				temp= new Node(ss,ss.isDirectory());
//				head.add(temp);
				if(ss.isDirectory()) {
					printAll(temp);
				}
			}
			else
				System.out.println(file.getAbsolutePath());
		}
		
	}
}
