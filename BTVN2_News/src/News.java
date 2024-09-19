
public class News implements INews{
	int ID;
	String title;
	String PublishDate;
	String author;
	String content;
	float averagerate;
	int[] RateList = new int[3];
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String publicDate) {
		PublishDate = publicDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAveragerate() {
		return averagerate;
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Title: "+title);
		System.out.println("Public Date: "+PublishDate);
		System.out.println("Author: "+author);
		System.out.println("Content: "+content);
		System.out.println("Average Rate: "+averagerate);
	}
	
	public void Calculate() {
		int sum=0;
		for(int i=0 ;i<RateList.length;i++) {
			sum+=RateList[i];
		}
		averagerate = (float)sum/RateList.length;
	}
	public int[] getRateList() {
		return RateList;
	}
	public void setRateList(int[] rateList) {
		RateList = rateList;
	}
	
	
}
