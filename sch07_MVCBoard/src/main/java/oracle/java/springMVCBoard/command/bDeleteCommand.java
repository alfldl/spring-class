package oracle.java.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import oracle.java.springMVCBoard.dao.BDao;


public class bDeleteCommand implements BCommand {

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		
		BDao dao = new BDao();
		dao.delete(bId);
		
	}

}
