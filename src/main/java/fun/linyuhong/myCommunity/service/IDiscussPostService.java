package fun.linyuhong.myCommunity.service;

import com.github.pagehelper.PageInfo;
import fun.linyuhong.myCommunity.entity.DiscussPost;

import javax.validation.constraints.Size;
import java.util.List;
import java.util.Map;

public interface IDiscussPostService {

    List<DiscussPost> selectDiscussPosts(int userId, int orderMode, int offset, int limit);

    int findDiscussPostRows(int userId);

    int addDiscussPost(DiscussPost post);

    DiscussPost getDiscussPost(Integer discussPostId);

    DiscussPost findDiscussPostById(int id);

    int updateType(int id, int type);

    int updateStatus(int id, int status);

    int updateScore(int id, double score);

}
