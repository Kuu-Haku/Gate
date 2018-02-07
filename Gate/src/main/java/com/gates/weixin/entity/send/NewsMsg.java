package com.gates.weixin.entity.send;

import java.util.List;

import com.gates.common.WeixinUtils;
import com.gates.weixin.enm.MsgType;
import com.gates.weixin.entity.BaseMsg;

public class NewsMsg extends BaseMsg{
	private int articleCount;
	private List<Item> articles;
	public NewsMsg(){
		this.setMsgType(MsgType.News.getName());
	}
	public int getArticleCount() {
		return articleCount;
	}
	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}
	public List<Item> getArticles() {
		return articles;
	}
	public void setArticles(List<Item> articles) {
		this.articles = articles;
	} 
	public String toString(){
		if(articles.size() > 8){
			//超过8个后面的省略保证发送成功
			articles = articles.subList(0, 8);
		}
		StringBuffer sb = new StringBuffer();
		sb.append("<ArticleCount>"+articleCount+"</ArticleCount>");
		sb.append("<Articles>");
		for(Item item:articles){
			sb.append(item.toString());
		}
		sb.append("</Articles>");
		return getXml(sb.toString());
	}
	
	public static class Item{
		private String title;
		private String description;
		private String picUrl;
		private String url;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getPicUrl() {
			return picUrl;
		}
		public void setPicUrl(String picUrl) {
			this.picUrl = picUrl;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String toString(){
			StringBuffer sb = new StringBuffer();
			sb.append("<item>");
			sb.append("<Title>"+WeixinUtils.text(title)+"</Title>");
			sb.append("<Description>"+WeixinUtils.text(description)+"</Description>");
			sb.append("<PicUrl>"+WeixinUtils.text(picUrl)+"</PicUrl>");
			sb.append("<Url>"+WeixinUtils.text(url)+"</Url>");
			sb.append("</item>");
			return sb.toString();
		}
	}
	
	
}


