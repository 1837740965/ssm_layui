import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import icu.taoy.entity.LayUser;
import icu.taoy.mapper.LayUserMapper;
import icu.taoy.service.LayUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application.xml"})
public class Demo {

    @Autowired
    private LayUserService layUserService;


    @Test
    public void demo() throws JsonProcessingException {
        String json = "[\n" +
                "    {\n" +
                "      \"id\": 10000,\n" +
                "      \"username\": \"user-0\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-0\",\n" +
                "      \"sign\": \"签名-0\",\n" +
                "      \"experience\": 255,\n" +
                "      \"logins\": 24,\n" +
                "      \"wealth\": 82830700,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 57\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10001,\n" +
                "      \"username\": \"user-1\",\n" +
                "      \"sex\": \"男\",\n" +
                "      \"city\": \"城市-1\",\n" +
                "      \"sign\": \"签名-1\",\n" +
                "      \"experience\": 884,\n" +
                "      \"logins\": 58,\n" +
                "      \"wealth\": 64928690,\n" +
                "      \"classify\": \"词人\",\n" +
                "      \"score\": 27\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10002,\n" +
                "      \"username\": \"user-2\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-2\",\n" +
                "      \"sign\": \"签名-2\",\n" +
                "      \"experience\": 650,\n" +
                "      \"logins\": 77,\n" +
                "      \"wealth\": 6298078,\n" +
                "      \"classify\": \"酱油\",\n" +
                "      \"score\": 31\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10003,\n" +
                "      \"username\": \"user-3\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-3\",\n" +
                "      \"sign\": \"签名-3\",\n" +
                "      \"experience\": 362,\n" +
                "      \"logins\": 157,\n" +
                "      \"wealth\": 37117017,\n" +
                "      \"classify\": \"诗人\",\n" +
                "      \"score\": 68\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10004,\n" +
                "      \"username\": \"user-4\",\n" +
                "      \"sex\": \"男\",\n" +
                "      \"city\": \"城市-4\",\n" +
                "      \"sign\": \"签名-4\",\n" +
                "      \"experience\": 807,\n" +
                "      \"logins\": 51,\n" +
                "      \"wealth\": 76263262,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 6\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10005,\n" +
                "      \"username\": \"user-5\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-5\",\n" +
                "      \"sign\": \"签名-5\",\n" +
                "      \"experience\": 173,\n" +
                "      \"logins\": 68,\n" +
                "      \"wealth\": 60344147,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 87\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10006,\n" +
                "      \"username\": \"user-6\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-6\",\n" +
                "      \"sign\": \"签名-6\",\n" +
                "      \"experience\": 982,\n" +
                "      \"logins\": 37,\n" +
                "      \"wealth\": 57768166,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 34\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10007,\n" +
                "      \"username\": \"user-7\",\n" +
                "      \"sex\": \"男\",\n" +
                "      \"city\": \"城市-7\",\n" +
                "      \"sign\": \"签名-7\",\n" +
                "      \"experience\": 727,\n" +
                "      \"logins\": 150,\n" +
                "      \"wealth\": 82030578,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 28\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10008,\n" +
                "      \"username\": \"user-8\",\n" +
                "      \"sex\": \"男\",\n" +
                "      \"city\": \"城市-8\",\n" +
                "      \"sign\": \"签名-8\",\n" +
                "      \"experience\": 951,\n" +
                "      \"logins\": 133,\n" +
                "      \"wealth\": 16503371,\n" +
                "      \"classify\": \"词人\",\n" +
                "      \"score\": 14\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10009,\n" +
                "      \"username\": \"user-9\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-9\",\n" +
                "      \"sign\": \"签名-9\",\n" +
                "      \"experience\": 484,\n" +
                "      \"logins\": 25,\n" +
                "      \"wealth\": 86801934,\n" +
                "      \"classify\": \"词人\",\n" +
                "      \"score\": 75\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10010,\n" +
                "      \"username\": \"user-10\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-10\",\n" +
                "      \"sign\": \"签名-10\",\n" +
                "      \"experience\": 1016,\n" +
                "      \"logins\": 182,\n" +
                "      \"wealth\": 71294671,\n" +
                "      \"classify\": \"诗人\",\n" +
                "      \"score\": 34\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10011,\n" +
                "      \"username\": \"user-11\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-11\",\n" +
                "      \"sign\": \"签名-11\",\n" +
                "      \"experience\": 492,\n" +
                "      \"logins\": 107,\n" +
                "      \"wealth\": 8062783,\n" +
                "      \"classify\": \"诗人\",\n" +
                "      \"score\": 6\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10012,\n" +
                "      \"username\": \"user-12\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-12\",\n" +
                "      \"sign\": \"签名-12\",\n" +
                "      \"experience\": 106,\n" +
                "      \"logins\": 176,\n" +
                "      \"wealth\": 42622704,\n" +
                "      \"classify\": \"词人\",\n" +
                "      \"score\": 54\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10013,\n" +
                "      \"username\": \"user-13\",\n" +
                "      \"sex\": \"男\",\n" +
                "      \"city\": \"城市-13\",\n" +
                "      \"sign\": \"签名-13\",\n" +
                "      \"experience\": 1047,\n" +
                "      \"logins\": 94,\n" +
                "      \"wealth\": 59508583,\n" +
                "      \"classify\": \"诗人\",\n" +
                "      \"score\": 63\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10014,\n" +
                "      \"username\": \"user-14\",\n" +
                "      \"sex\": \"男\",\n" +
                "      \"city\": \"城市-14\",\n" +
                "      \"sign\": \"签名-14\",\n" +
                "      \"experience\": 873,\n" +
                "      \"logins\": 116,\n" +
                "      \"wealth\": 72549912,\n" +
                "      \"classify\": \"词人\",\n" +
                "      \"score\": 8\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10015,\n" +
                "      \"username\": \"user-15\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-15\",\n" +
                "      \"sign\": \"签名-15\",\n" +
                "      \"experience\": 1068,\n" +
                "      \"logins\": 27,\n" +
                "      \"wealth\": 52737025,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 28\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10016,\n" +
                "      \"username\": \"user-16\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-16\",\n" +
                "      \"sign\": \"签名-16\",\n" +
                "      \"experience\": 862,\n" +
                "      \"logins\": 168,\n" +
                "      \"wealth\": 37069775,\n" +
                "      \"classify\": \"酱油\",\n" +
                "      \"score\": 86\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10017,\n" +
                "      \"username\": \"user-17\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-17\",\n" +
                "      \"sign\": \"签名-17\",\n" +
                "      \"experience\": 1060,\n" +
                "      \"logins\": 187,\n" +
                "      \"wealth\": 66099525,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 69\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10018,\n" +
                "      \"username\": \"user-18\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-18\",\n" +
                "      \"sign\": \"签名-18\",\n" +
                "      \"experience\": 866,\n" +
                "      \"logins\": 88,\n" +
                "      \"wealth\": 81722326,\n" +
                "      \"classify\": \"词人\",\n" +
                "      \"score\": 74\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10019,\n" +
                "      \"username\": \"user-19\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-19\",\n" +
                "      \"sign\": \"签名-19\",\n" +
                "      \"experience\": 682,\n" +
                "      \"logins\": 106,\n" +
                "      \"wealth\": 68647362,\n" +
                "      \"classify\": \"词人\",\n" +
                "      \"score\": 51\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10020,\n" +
                "      \"username\": \"user-20\",\n" +
                "      \"sex\": \"男\",\n" +
                "      \"city\": \"城市-20\",\n" +
                "      \"sign\": \"签名-20\",\n" +
                "      \"experience\": 770,\n" +
                "      \"logins\": 24,\n" +
                "      \"wealth\": 92420248,\n" +
                "      \"classify\": \"诗人\",\n" +
                "      \"score\": 87\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10021,\n" +
                "      \"username\": \"user-21\",\n" +
                "      \"sex\": \"男\",\n" +
                "      \"city\": \"城市-21\",\n" +
                "      \"sign\": \"签名-21\",\n" +
                "      \"experience\": 184,\n" +
                "      \"logins\": 131,\n" +
                "      \"wealth\": 71566045,\n" +
                "      \"classify\": \"词人\",\n" +
                "      \"score\": 99\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10022,\n" +
                "      \"username\": \"user-22\",\n" +
                "      \"sex\": \"男\",\n" +
                "      \"city\": \"城市-22\",\n" +
                "      \"sign\": \"签名-22\",\n" +
                "      \"experience\": 739,\n" +
                "      \"logins\": 152,\n" +
                "      \"wealth\": 60907929,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 18\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10023,\n" +
                "      \"username\": \"user-23\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-23\",\n" +
                "      \"sign\": \"签名-23\",\n" +
                "      \"experience\": 127,\n" +
                "      \"logins\": 82,\n" +
                "      \"wealth\": 14765943,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 30\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10024,\n" +
                "      \"username\": \"user-24\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-24\",\n" +
                "      \"sign\": \"签名-24\",\n" +
                "      \"experience\": 212,\n" +
                "      \"logins\": 133,\n" +
                "      \"wealth\": 59011052,\n" +
                "      \"classify\": \"词人\",\n" +
                "      \"score\": 76\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10025,\n" +
                "      \"username\": \"user-25\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-25\",\n" +
                "      \"sign\": \"签名-25\",\n" +
                "      \"experience\": 938,\n" +
                "      \"logins\": 182,\n" +
                "      \"wealth\": 91183097,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 69\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10026,\n" +
                "      \"username\": \"user-26\",\n" +
                "      \"sex\": \"男\",\n" +
                "      \"city\": \"城市-26\",\n" +
                "      \"sign\": \"签名-26\",\n" +
                "      \"experience\": 978,\n" +
                "      \"logins\": 7,\n" +
                "      \"wealth\": 48008413,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 65\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10027,\n" +
                "      \"username\": \"user-27\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-27\",\n" +
                "      \"sign\": \"签名-27\",\n" +
                "      \"experience\": 371,\n" +
                "      \"logins\": 44,\n" +
                "      \"wealth\": 64419691,\n" +
                "      \"classify\": \"诗人\",\n" +
                "      \"score\": 60\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10028,\n" +
                "      \"username\": \"user-28\",\n" +
                "      \"sex\": \"女\",\n" +
                "      \"city\": \"城市-28\",\n" +
                "      \"sign\": \"签名-28\",\n" +
                "      \"experience\": 977,\n" +
                "      \"logins\": 21,\n" +
                "      \"wealth\": 75935022,\n" +
                "      \"classify\": \"作家\",\n" +
                "      \"score\": 37\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 10029,\n" +
                "      \"username\": \"user-29\",\n" +
                "      \"sex\": \"男\",\n" +
                "      \"city\": \"城市-29\",\n" +
                "      \"sign\": \"签名-29\",\n" +
                "      \"experience\": 647,\n" +
                "      \"logins\": 107,\n" +
                "      \"wealth\": 97450636,\n" +
                "      \"classify\": \"酱油\",\n" +
                "      \"score\": 27\n" +
                "    }\n" +
                "  ]";
        List list = new ObjectMapper().readValue(json, List.class);
        layUserService.saveBatch(list);
    }

    @Test
    public void demo1() {
        layUserService.saveLayUser(new LayUser(null, "sadas", "sadas", "sda", "asda", 10, 10, 55, "asda", 10));
    }
}
