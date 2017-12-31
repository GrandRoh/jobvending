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
  "buttons" : ["���� 1", "���� 2", "���� 3"]
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
    "text": "������ ������ ���������� ��ϵǾ����ϴ�. �����մϴ�!",
    "photo": {
      "url": "https://photo.src",
      "width": 640,
      "height": 480
    },
    "message_button": {
      "label": "���� �����ޱ�",
      "url": "https://coupon/url"
    }
  },
  "keyboard": {
    "type": "buttons",
    "buttons": [
      "ó������",
      "�ٽ� ����ϱ�",
      "����ϱ�"
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
