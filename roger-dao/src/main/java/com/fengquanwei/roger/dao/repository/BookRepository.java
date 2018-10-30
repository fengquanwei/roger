package com.fengquanwei.roger.dao.repository;

import com.fengquanwei.roger.dao.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 图书仓库
 *
 * @author fengquanwei
 * @create 2018/10/29 23:56
 **/
public interface BookRepository extends JpaRepository<Book, Long> {
    /**
     * 根据图书编号查询图书
     */
    Book findByBookNo(String bookNo);
}
