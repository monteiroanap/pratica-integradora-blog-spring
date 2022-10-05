package br.com.meli.blog.service;

import br.com.meli.blog.exceptions.IdExistenteException;
import br.com.meli.blog.model.Blog;
import br.com.meli.blog.repository.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//regra de negocio é definida aqui

@Service
public class GerenciaBlogService implements IBLog{

    @Autowired
    private BlogRepo blogRepository;

    @Override
    public Blog criarBLog(Blog blog) throws IdExistenteException {
        blogRepository.createBlog(blog);
        return blog;
    }

    @Override
    public Blog consultarBlogId(int id) {
        return null;
    }

    @Override
    public List<Blog> consultarLista() {
        return blogRepository.getAll();
    }
}
