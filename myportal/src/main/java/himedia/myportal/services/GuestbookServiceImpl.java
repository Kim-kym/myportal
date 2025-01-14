package himedia.myportal.services;

import java.util.List;

import himedia.myportal.repositories.vo.GuestbookVo;

public class GuestbookServiceImpl 
	implements GuestbookService {

	@Override
	public List<GuestbookVo> getMessageList() {
		
		return null;
	}

	@Override
	public boolean writeMessage(GuestbookVo vo) {
		
		return false;
	}

	@Override
	public boolean deleteMessage(GuestbookVo vo) {
		
		return false;
	}
	

}
