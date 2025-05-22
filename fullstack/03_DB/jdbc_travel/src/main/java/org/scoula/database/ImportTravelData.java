package org.scoula.database;

import com.opencsv.bean.CsvToBeanBuilder;
import org.scoula.common.JDBCUtil;
import org.scoula.travel.dao.TravelDao;
import org.scoula.travel.dao.TravelDaoImpl;
import org.scoula.travel.domain.TravelVO;

import java.io.FileReader;
import java.util.List;

/**
 * OpenCSV 라이브러리
 * : CSV 파일 읽기 때 도와주는 라이브러리
 */
public class ImportTravelData {

    public static void main(String[] args) throws Exception {

        TravelDao dao = new TravelDaoImpl();

        List<TravelVO> travels = new CsvToBeanBuilder<TravelVO>(new FileReader("travel.csv"))
                .withType(TravelVO.class)
                .build()
                .parse();

        travels.forEach(travel -> {
            System.out.println(travel);
            dao.insert(travel);
        });

        JDBCUtil.close();
    }
}