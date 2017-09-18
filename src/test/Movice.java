package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.movies.GetMessage;
import com.liu.other.util.DateUtil;
import com.liu.ssm.pojo.MovieWeek;
import com.liu.ssm.service.MovieWeekService;

public class Movice {
	
	@Test
	public void testLists() throws Exception{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		MovieWeekService movieWeekService = (MovieWeekService) context.getBean("movieWeekService");
		GetMessage getMessage = new GetMessage();
		//
		long startTime = new DateUtil().dateDateToLong("2007-12-24", DateUtil.DATE_DATE);
		long endTime = new DateUtil().dateDateToLong("1990-01-01", DateUtil.DATE_DATE);
		
		while (startTime > endTime) {
			String startDate = DateUtil.TimeToDate(startTime, DateUtil.DATE_DATE);
			String dataString = getMessage.getWeek(startDate);
			
			//保存数据
			List<MovieWeek> list = new ArrayList<>();
			JSONObject jsonObject = JSONObject.fromObject(dataString);
			JSONArray jsonArray = (JSONArray) jsonObject.get("data1");
			if (jsonArray.isEmpty()) {
				break;
			}
			for (Object object : jsonArray) {
				JSONObject json = JSONObject.fromObject(object);
				MovieWeek movieWeek = new MovieWeek();
				movieWeek.setMovierank(Integer.parseInt(!StringUtils.isEmpty((String) json.get("MovieRank")) ? (String) json.get("MovieRank") : "222"));
				movieWeek.setMovieid((String)json.get("MovieID") != null && (String)json.get("MovieID") != "" ? (String)json.get("MovieID") : "");
				movieWeek.setMoviename((String)json.get("MovieName") != null  ? (String)json.get("MovieName") : "");
				movieWeek.setWeekamount(Long.parseLong(!StringUtils.isEmpty((String) json.get("WeekAmount")) ? (String) json.get("WeekAmount"):"0"));
				movieWeek.setSumweekamount(Long.parseLong(!StringUtils.isEmpty((String) json.get("SumWeekAmount"))? (String) json.get("SumWeekAmount") : "0"));
				movieWeek.setPeople(Integer.parseInt(!StringUtils.isEmpty((String) json.get("People")) ? (String) json.get("People") : "0"));
				movieWeek.setMovieday(Integer.parseInt(!StringUtils.isEmpty((String)json.get("MovieDay")) ? (String) json.get("MovieDay") : "0"));
				movieWeek.setAvgprice(Integer.parseInt(!StringUtils.isEmpty((String)json.get("AvgPrice")) ? (String) json.get("AvgPrice") : "0"));
				movieWeek.setAvgpeople(Integer.parseInt(!StringUtils.isEmpty((String)json.get("AvgPeople")) ? (String) json.get("AvgPeople") : "0"));
				movieWeek.setAmountUp((String)json.get("Amount_Up") != null ? (String)json.get("Amount_Up") : "");
				movieWeek.setScreenUp((String)json.get("Screen_Up") != null ? (String)json.get("Screen_Up") : "");
				movieWeek.setPeopleUp((String)json.get("People_Up") != null ? (String)json.get("People_Up") : "");
				movieWeek.setDefaultimage((String)json.get("DefaultImage") != null ? (String)json.get("DefaultImage") : "");
				movieWeek.setRankUp((String)json.get("Rank_Up") != null ? (String)json.get("Rank_Up") : "");
				movieWeek.setWomindex(Double.parseDouble(!StringUtils.isEmpty((String) json.get("WomIndex")) ? (String) json.get("WomIndex") : "0"));
				movieWeek.setSdate(startDate);
				list.add(movieWeek);
			}
			movieWeekService.addWeekMovieDatas(list);
			
			//保存过后把开始时间向后腿一个星期
			startTime = startTime - 1000l*60l*60l*24l*7l;
			System.out.println(startDate);
		}
		
		System.out.println("结束");
	}
}
