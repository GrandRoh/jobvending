package com.jobvending.kakao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jobvending.user.UserEntity;
import com.jobvending.user.UserRepository;

@RestController
public class ApiController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/keyboard", method = RequestMethod.GET)
	public Map<String, Object> keyboard() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		/**
		 * 
{
  "type" : "buttons",
  "buttons" : ["선택 1", "선택 2", "선택 3"]
}		
		 */
		
		return resultMap;
	}

	
	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public Map<String, Object> message(String user_key, String type, String content) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("job", "searching");
		resultMap.put("user_key", user_key);
		resultMap.put("type", type);
		
		UserEntity userEntity = new UserEntity();
		userEntity.setUser_key(user_key);
		userRepository.save(userEntity);
		
		return resultMap;
		/**
		 * 
		 * 
{
  "message": {
    "text": "귀하의 차량이 성공적으로 등록되었습니다. 축하합니다!",
    "photo": {
      "url": "https://photo.src",
      "width": 640,
      "height": 480
    },
    "message_button": {
      "label": "주유 쿠폰받기",
      "url": "https://coupon/url"
    }
  },
  "keyboard": {
    "type": "buttons",
    "buttons": [
      "처음으로",
      "다시 등록하기",
      "취소하기"
    ]
  }
}
		 * 
		 */
		

	}

	@RequestMapping(value = "/friend" , method = RequestMethod.POST)
	public Map<String, Object> friendPost() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		

		
		return resultMap;
	}
	
	@RequestMapping(value = "/friend" , method = RequestMethod.DELETE)
	public Map<String, Object> friendDelete() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		

		return resultMap;
	}

}
