import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class CollegeLoader {

    public static List<College> loadColleges(String path) {
        try {
            Gson gson = new Gson();
            Type listType = new TypeToken<List<College>>(){}.getType();
            return gson.fromJson(new FileReader(path), listType);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}