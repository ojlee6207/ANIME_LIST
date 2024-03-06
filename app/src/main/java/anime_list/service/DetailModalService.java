package anime_list.service;

import anime_list.config.JDBC;
import anime_list.model.dao.DetailModalDao;
import anime_list.model.vo.AniList;
import anime_list.model.vo.Comment;


import java.sql.Connection;
import java.util.ArrayList;

public class DetailModalService {
    public ArrayList<AniList> selectEachListinModal(String key) { 
        Connection conn = JDBC.getConnection();
        ArrayList<AniList> list = new DetailModalDao().selectEachListinModal(conn, key);
        JDBC.close(conn);

        return list;
    }

    public ArrayList<Comment> selectCommentinModal(String key) {
        Connection conn = JDBC.getConnection();
        ArrayList<Comment> list = new DetailModalDao().selectCommentinModal(conn, key);
        JDBC.close(conn);

        return list;
    }
}
