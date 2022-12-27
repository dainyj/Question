package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class MuseumDAO extends JDBCTemplate {

	public void intert(List<MuseumVo> mvo) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
//		String sql ="INSERT INTO MUSEUM VALUES('" + BIZPLC_NM + "','" +MUSEUM_ARTGLRY_TYPE_NM + "','" + SIGUN_NM +"','" + REFINE_ROADNM_ADDR + "','" + BSN_STATE_NM + "')";
		
//		try {
//			pstm = con.prepareStatement(sql);
//			
//			for(int i=0;i<mvo.size();i++) {
//				MuseumVo 
//			}
//			
//		}catch()
		
	}

	public static void main(String[] args) {

	}
}
