package storage;
import exceptions.FigureError;
import geometry2d.Figure;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class BinaryFigureStorage implements FigureStorage {
    @Override
    public List<Figure> read(Path path)
            throws IOException, FigureError {

        try (ObjectInputStream in = new ObjectInputStream(
                Files.newInputStream(path))) {

            Object object = in.readObject();

            if (!(object instanceof List<?> list)) {
                throw new FigureError(
                        "Файл не содержит список фигур", null);
            }

            List<Figure> figures = new ArrayList<>();

            for (Object item : list) {
                if (!(item instanceof Figure figure)) {
                    throw new FigureError(
                            "В списке обнаружен объект, не являющийся фигурой",
                            null);
                }

                figures.add(figure);
            }

            return figures;

        } catch (ClassNotFoundException e) {
            throw new FigureError(
                    "Не удалось найти класс при чтении файла", e);
        }
    }

    @Override
    public void write(Path path, List<Figure> figures)
            throws IOException {

        try (ObjectOutputStream out = new ObjectOutputStream(
                Files.newOutputStream(path))) {
            out.writeObject(figures);
        }
    }
}