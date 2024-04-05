package com.james.api.article;

import com.james.api.common.command.CommandService;
import com.james.api.common.query.QueryService;

import java.sql.SQLException;
import java.util.*;

public interface ArticleService extends CommandService<ArticleDto>, QueryService<ArticleDto> {


}
