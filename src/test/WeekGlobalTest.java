package test;

import java.util.ArrayList;
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
import com.liu.ssm.pojo.WeekGlobal;
import com.liu.ssm.service.MovieWeekService;
import com.liu.ssm.service.WeekGlobalService;

public class WeekGlobalTest {
	
	@Test
	public void test() throws Exception{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		WeekGlobalService weekGlobalService = (WeekGlobalService) context.getBean("weekGlobalService");
		GetMessage getMessage = new GetMessage();
		int weekNumber = 1229;
		
		//循环保存每周的数据
		while (weekNumber > 0) {
			List<WeekGlobal> list = new ArrayList<WeekGlobal>();
			String string = getMessage.getWeekGlobal(weekNumber);
			if (string.equals("[]")) {
				weekNumber--;
				continue;
			}
			JSONArray jsonArray = JSONArray.fromObject(string);
			for (Object item : jsonArray) {
				JSONObject jsonObject = JSONObject.fromObject(item);
				WeekGlobal weekGlobal = new WeekGlobal();
				//weekGlobal.setWeekId(Integer.parseInt((String)jsonObject.get(weekNumber)));
				weekGlobal.setWeekId(weekNumber);
				weekGlobal.setRank(Integer.parseInt(StringUtils.isEmpty((String)jsonObject.get("Rank")) ? "11" : (String)jsonObject.get("Rank")));
				weekGlobal.setRankChange(Integer.parseInt(StringUtils.isEmpty((String)jsonObject.get("RankChange")) ? "0" : (String)jsonObject.get("RankChange")));
				weekGlobal.setMovieName(StringUtils.isEmpty((String) jsonObject.get("MovieName")) ? "未知电影" : (String) jsonObject.get("MovieName"));
				weekGlobal.setBoxOffice(Integer.parseInt(StringUtils.isEmpty((String)jsonObject.get("BoxOffice")) ? "0" : (String)jsonObject.get("BoxOffice")));
				weekGlobal.setSumBoxOffice(Integer.parseInt(StringUtils.isEmpty((String)jsonObject.get("SumBoxOffice")) ? "0" : (String)jsonObject.get("SumBoxOffice")));
				weekGlobal.setUsaBoxOffice(Integer.parseInt(StringUtils.isEmpty((String)jsonObject.get("USABoxOffice")) ? "0" : (String)jsonObject.get("USABoxOffice")));
				weekGlobal.setCountryNum(Integer.parseInt(StringUtils.isEmpty((String)jsonObject.get("CountryNum")) ? "0" : (String)jsonObject.get("CountryNum")));
				weekGlobal.setMovieDay(Integer.parseInt(StringUtils.isEmpty((String)jsonObject.get("MovieDay")) ? "0" : (String)jsonObject.get("MovieDay")));
				weekGlobal.setDefaultImage(StringUtils.isEmpty((String)jsonObject.get("DefaultImage")) ? "" : (String)jsonObject.get("DefaultImage"));
				weekGlobal.setWeekNum(Integer.parseInt(StringUtils.isEmpty((String)jsonObject.get("WeekNum")) ? "0" : (String)jsonObject.get("WeekNum")));
				weekGlobal.setBoxOfficePro(Integer.parseInt(StringUtils.isEmpty((String)jsonObject.get("BoxOffice_Pro")) ? "0" : (String)jsonObject.get("BoxOffice_Pro")));
				weekGlobal.setLastRank(Integer.parseInt(StringUtils.isEmpty((String)jsonObject.get("LastRank")) ? "0" : (String)jsonObject.get("LastRank")));
				list.add(weekGlobal);
			}
			weekGlobalService.addWeekGlobalDatas(list);
			System.out.println("保存第：      " + weekNumber);
			//保存本周，周数减一
			weekNumber--;
		}
		
	}	
}
