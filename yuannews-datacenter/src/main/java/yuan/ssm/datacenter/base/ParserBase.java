package yuan.ssm.datacenter.base;

import org.jsoup.nodes.Document;
import yuan.ssm.vo.NewsVo;

import java.util.List;

/**
 * ==================================================
 * <p/>
 * 版权：　软件工程.net12-1 原明卓
 * <p/>
 * 项目：　基于用户兴趣标签的新闻推荐系统
 * <p/>
 * 作者：　原明卓
 * <p/>
 * 版本：　1.0
 * <p/>
 * 创建日期：　16-5-4 下午2:25
 * <p/>
 * 功能描述： 解析抽象类，所有的解析类，包含两个方法
 * 1.解析主页 List<String>
 * 2.解析详情页 ， 返回 NewsVo
 * 3.解析详情页，进行数据存储操作 - > mysql
 * <p>
 * <p/>
 * 功能更新历史：
 * <p>
 * ==================================================
 */
public abstract class ParserBase {

    protected String url;
    protected Document doc;

    public ParserBase(String url, Document doc) {
        this.url = url;
        this.doc = doc;
    }

    protected abstract NewsVo parserDetailPage(String url, Document doc);

    protected abstract List<String> parserIndexPage(String url, Document doc);

    protected void toMysql(){
        //TODO 存储到mysql中
    }


}
