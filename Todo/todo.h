#ifndef TODO_H
#define TODO_H

#include <QMainWindow>

namespace Ui {
class Todo;
}

class Todo : public QMainWindow
{
    Q_OBJECT

public:
    explicit Todo(QWidget *parent = 0);
    ~Todo();

private:
    Ui::Todo *ui;
};

#endif // TODO_H
