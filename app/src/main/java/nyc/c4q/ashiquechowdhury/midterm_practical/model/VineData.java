package nyc.c4q.ashiquechowdhury.midterm_practical.model;

import java.util.List;

/**
 * Created by ashiquechowdhury on 12/10/16.
 */
public class VineData {
    public List<RecordList> getVineRecordList() {
        return records;
    }

    public int getCount() {
        return count;
    }

    List<RecordList> records;
    int count;
}
