import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stupendousware.resumeservice.models.Work;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.List;

public class ResumeRepositoryTest {
    @Test
    public void workJsonDeserializeTest_Success() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Work> workList = objectMapper.readValue(
                new ClassPathResource("work.json").getFile(),
                new TypeReference<>(){});

        assertTrue(workList.get(0).getCompany().equals("Paypal"));
    }
}
