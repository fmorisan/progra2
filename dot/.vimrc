set number		"Line numbers
set showcmd		"Show incomplete commands at the bottom
set novisualbell    "Visual bell sucks
set showmode		"Show current mode as well
set autoread		"Reload changed files outside of vim

"I like my syntax coloring ok?
syntax on

"Set some abbreviations
abbreviate pub public
abbreviate prv private
abbreviate teh the
abbreviate ds dan sucks

"Change leader modifier to comma
let mapleader=","

"Swap files suck
set noswapfile
set nobackup
set nowb

"Make some nice indentation things
set autoindent
set smartindent
set smarttab
set expandtab		"Use spaces instead of tab characters
set tabstop=4
set shiftwidth=4
set list listchars=tab:»·,trail:·

"Get my theme running!
set background=dark
"colorscheme solarized

"Map <C-l> to turn off search hls until next search
nnoremap <C-L> :nohl<CR><C-L>

"Enable mouse usage
set mouse=a

"Use case insensitive search except when specifying capitals
set ignorecase
set smartcase
