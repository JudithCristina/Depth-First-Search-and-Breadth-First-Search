class Nodo(object):

    # Atributos
    valor = ""
    visitado = False
    vecinosList = []

    # Metodos
    def __init__(self, valor, visitado):
        self.valor = valor
        self.visitado = visitado

    def setValor(self,valor):
        self.valor = valor

    def getValor(self):
        return self.valor

    def setVisitado(self,visitado):
        self.visitado = visitado

    def isVisitado(self):
        return self.visitado

    def setVecinosList(self,vecinosList):
        self.vecinosList = vecinosList

    def getVecinosList(self):
        return self.vecinosList

    def cantidadVecinos(self):
        return len(self.vecinosList)

    def imprimir(self):
        print (self.valor,self.visitado)


class DeepFirstSearch(object):
    cola = []
    def buscar(self, nodoBase, nodoFinal):
        nodoBase.setVisitado(True)
        self.cola.append(nodoBase)
        while ( len(self.cola) > 0 ):
            if nodoFinal in self.cola :
                print ("--> Found " + "G")
                return
            nodoActual = self.cola.pop(len(self.cola)-1) #FIFO
            print ("-->", nodoActual.getValor())

            for i in range(0,nodoActual.cantidadVecinos()):
                # print (i)
                if ( not nodoActual.vecinosList[i].isVisitado() ):
                    nodoActual.vecinosList[i].setVisitado(True)
                    self.cola.append(nodoActual.vecinosList[i])


if __name__ == "__main__":
    nodoS = Nodo("S",False)
    nodoD = Nodo("D",False)
    nodoA = Nodo("A",False)
    nodoE = Nodo("E",False)
    nodoB = Nodo("B",False)
    nodoC = Nodo("C",False)
    nodoF = Nodo("F",False)
    nodoG = Nodo("G",False)

    nodoS.setVecinosList([nodoD,nodoA])
    nodoD.setVecinosList([nodoE,nodoA])
    nodoA.setVecinosList([nodoD,nodoB])
    nodoE.setVecinosList([nodoF,nodoB])
    nodoB.setVecinosList([nodoE,nodoC])
    nodoF.setVecinosList([nodoG])


    bfs = BreadthFirstSearch()
    bfs.buscar(nodoS, nodoG)
