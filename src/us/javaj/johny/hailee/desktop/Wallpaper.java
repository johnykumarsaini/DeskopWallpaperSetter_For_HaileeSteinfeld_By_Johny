package us.javaj.johny.hailee.desktop;

import java.io.Serializable;

public class Wallpaper implements Serializable {
	
	    private String startTime;
		private String endTime;
		private String imageURL;
		private String type;

		public String getStartTime() {
			return startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getImageURL() {
			return imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}
		
		

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return "Wallpaper [startTime=" + startTime + ", endTime=" + endTime + ", imageURL=" + imageURL + ", type="
					+ type + "]";
		}

		


}
