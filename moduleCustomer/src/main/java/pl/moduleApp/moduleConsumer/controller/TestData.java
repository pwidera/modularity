package pl.moduleApp.moduleConsumer.controller;

public class TestData {
		private Integer ad1;
		private String ad2;

		public TestData() {
		}

	public Integer getAd1() {
		return ad1;
	}

	public void setAd1(Integer ad1) {
		this.ad1 = ad1;
	}

	public String getAd2() {
			return ad2;
		}

		public void setAd2(String ad2) {
			this.ad2 = ad2;
		}

		@Override
		public String toString() {
			return "TestData{" +
					"ad1='" + ad1 + '\'' +
					", ad2='" + ad2 + '\'' +
					'}';
		}
	}