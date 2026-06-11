# 📘 Lesson_GitHub — Git et GitHub

---

## 🔑 Définitions essentielles

| Mot | Définition simple |
|---|---|
| **Git** | L'outil sur ton ordinateur qui gère et envoie ton code |
| **GitHub** | L'armoire sur internet qui stocke ton code |
| **Repository (repo)** | Un dossier projet sur GitHub |
| **Clone** | Copier un repo GitHub sur ton ordinateur |
| **Commit** | Préparer un envoi avec un message explicatif |
| **Push** | Envoyer ton code sur GitHub |
| **Token** | Mot de passe sécurisé pour se connecter à GitHub |

---

## 🗺️ Le schéma général

```
TON ORDINATEUR  →  git add  →  git commit  →  git push  →  GITHUB
```

---

## ⚙️ Configuration initiale (une seule fois)

```bash
# Déclare ton nom
git config --global user.name "Ton Prénom Nom"

# Déclare ton email
git config --global user.email "ton@email.com"

# Vérifie la version de Git
git --version
```

---

## 🚀 Les 4 commandes essentielles

### 1. Clone — Copie un repo sur ton ordinateur
```bash
git clone https://github.com/TonPrénom/NomDuRepo.git
```
👉 À faire **une seule fois** par projet.

### 2. Add — Prépare un fichier à envoyer
```bash
# Ajoute un fichier spécifique
git add NomDuFichier.java

# Ajoute TOUS les fichiers modifiés
git add .
```

### 3. Commit — Prépare l'envoi avec un message
```bash
git commit -m "Ton message explicatif ici"
```
👉 Le message doit expliquer ce que tu as fait.
👉 Exemples de bons messages :
- `"Ajout du projet Calculatrice"`
- `"Correction du bug dans la boucle"`
- `"Ajout de la leçon 7"`

### 4. Push — Envoie sur GitHub
```bash
git push
```

---

## 📋 Les commandes utiles

| Commande | Rôle |
|---|---|
| `pwd` | Affiche le dossier où tu es |
| `ls` | Liste les fichiers du dossier |
| `cd NomDuDossier` | Entre dans un dossier |
| `cp chemin/fichier .` | Copie un fichier ici |
| `find ~/chemin -name "fichier"` | Cherche un fichier |

---

## 🔄 Workflow quotidien du développeur

```
1. Tu modifies ton code dans IntelliJ
2. git add NomDuFichier.java
3. git commit -m "Ce que tu as fait"
4. git push
5. Ton code est sauvegardé sur GitHub ✅
```

---

## 🔐 Le Token GitHub

- GitHub n'accepte plus les mots de passe classiques
- Tu dois créer un **Token** dans Settings → Developer settings → Personal access tokens
- Le token ne s'affiche **qu'une seule fois** → le copier immédiatement !
- Utilise le token comme mot de passe dans le terminal

---

## 📁 Structure de ton repo

```
Java_Cours/
├── README.md
└── Calculatrice.java
```

---

## ✅ Validé le

Leçon GitHub — Git et GitHub — Validée ✅
