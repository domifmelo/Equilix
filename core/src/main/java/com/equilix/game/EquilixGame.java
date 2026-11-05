
package com.equilix.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class EquilixGame extends ApplicationAdapter {

    private ShapeRenderer shape;
    private float jogadorX;
    private float jogadorY;

    @Override
    public void create() {
        shape = new ShapeRenderer();

        // Posicao inicial do personagem
        jogadorX = 380;
        jogadorY = 100;
    }

    @Override
    public void render() {
        // Limpa a tela com uma cor azul
        Gdx.gl.glClearColor(0.2f, 0.5f, 0.8f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shape.begin(ShapeRenderer.ShapeType.Filled);

        // Chao do jogo
        shape.setColor(0.2f, 0.7f, 0.3f, 1);
        shape.rect(0, 0, 800, 80);

        // Personagem
        shape.setColor(1, 1, 0, 1);
        shape.rect(jogadorX, jogadorY, 40, 40);

        shape.end();
    }

    @Override
    public void dispose() {
        shape.dispose();
    }
}
