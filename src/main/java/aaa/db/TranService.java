package aaa.db;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TranService {
	TranMapper tm;
	
	@Transactional
	public void tranGo() {
		//try-catch 존재시 @Transactional실행 안함
		tm.insert2(arrs(120,121,122));
	}
	
	ArrayList<BoardDTO> arrs(int ...arr){
		ArrayList<BoardDTO> res = new ArrayList<>();
		for (int i : arr) {
			res.add(new BoardDTO(i,"제목"+i,"유택"+i));
		}
		
		return res;
	}
}
